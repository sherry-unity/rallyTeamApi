import java.io.IOException;
import com.google.gson.Gson;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/** Performing authentication with Rallyteam's job service.
*/
public class Authentication 
{
	final private String url = "https://dev.rallyteam.com/api/v1/token";
	private String username;
	private String password;
	
	/**Constructor
	 * 
	 * @param username the user name.
	 * @param password the user's password
	 */
	Authentication(String username, String password)
	{
		this.username = username;
		this.password = password;
	}
	
	/**Retrieving authentication data
	 * 
	 * @return AuthenticationData
	 * @throws Exception
	 */
	AuthenticationData retrieve() throws Exception
	{
		OkHttpClient client = new OkHttpClient();
		MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
		String requestBodyStr = "username=" + this.username + "&password=" + this.password + "&grant_type=password";
		RequestBody body = RequestBody.create(mediaType, requestBodyStr);
		Request request = new Request.Builder()
		  .url(this.url)
		  .post(body)
		  .addHeader("Content-Type", "application/x-www-form-urlencoded")
		  .addHeader("Content-Type", "charset=utf-8")
		  .addHeader("Cache-Control", "no-cache")
		  .addHeader("userName", this.username)
		  .addHeader("password", this.password)
		  .addHeader("grant_type", "password")
		  .build();

		Response response = client.newCall(request).execute();
		if (!response.isSuccessful())
			throw new IOException("Error in getting the authentication response code," + response);

		String responseStr = response.body().string();
		AuthenticationData data = new Gson().fromJson(responseStr, AuthenticationData.class);
		return data;
	}
	
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	public String getUsername()
	{
		return this.username;
	}
	
	public void setPassworde(String password)
	{
		this.password = password;
	}
	
	public String getPassword()
	{
		return this.password;
	}
}