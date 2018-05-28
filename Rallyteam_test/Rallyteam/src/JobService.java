import java.io.IOException;
import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class JobService
{
	final private String url = "https://dev.rallyteam.com/api/v3/jobs/";
	private String token;
	
	JobService(AuthenticationData authenticationData)
	{
		this.token = "Bearer " + authenticationData.getAccess_token();
	}
	
	JobV3DtoData getJobById(Integer id) throws Exception
	{
		OkHttpClient client = new OkHttpClient();
		Request request = new Request.Builder()
			  .url(this.url + id)
			  .get()
			  .addHeader("id", id.toString())
			  .addHeader("Authorization", this.token)
			  .addHeader("Cache-Control", "no-cache")
			  .addHeader("Content-Type", "charset=utf-8")
			  .build();
		
		Response response = client.newCall(request).execute();
		if (!response.isSuccessful())
			throw new IOException("Error in getting the job by id," + response);
		
		String responseStr = response.body().string();
		JobV3DtoData data = new Gson().fromJson(responseStr, JobV3DtoData.class);
		return data;
	}
	
	PagedResultData getAvailableJobs() throws Exception
	{
		OkHttpClient client = new OkHttpClient();
		Request request = new Request.Builder()
				  .url(this.url + "?filter=open&isOnSite=false")
				  .get()
				  .addHeader("Authorization", this.token)
				  .addHeader("Cache-Control", "no-cache")
				  .addHeader("Content-Type", "charset=utf-8")
				  .build();
		
		Response response = client.newCall(request).execute();
		if (!response.isSuccessful())
			throw new IOException("Error in getting available jobs," + response);
		
		String responseStr = response.body().string();
		PagedResultData data = new Gson().fromJson(responseStr, PagedResultData.class);
		return data;
	}
}
