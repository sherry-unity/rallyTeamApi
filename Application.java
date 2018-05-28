/**
 * Rallyteam Job Service
 * @author Sharareh Faramarz
 * @version 1.0
 */
public class Application 
{
	public static void main(String... args) throws Exception
	{
		final String username = "ironext@gmail.com";
		final String password = "Salvation5912";
		
		System.out.println("Authenticating user " + username + " ...");
		Authentication authentication = new Authentication(username, password);
		AuthenticationData authenticationData = authentication.retrieve();
		
		System.out.println("Getting available jobs, please wait ...");
		JobService jobService = new JobService(authenticationData);
		PagedResultData pagedResultData = jobService.getAvailableJobs();
		
		int numOfAvailableJob = pagedResultData.getData().size();
		System.out.println("Currently there are " + numOfAvailableJob + " available jobs:\n");
		
		for (int i = 0; i < numOfAvailableJob; i++)
		{
			int currentJobId = pagedResultData.getData().get(i).getId();
			JobV3DtoData currentJobById = jobService.getJobById(currentJobId);

			String currentJobTitle = currentJobById.getTitle();
			System.out.println(i + ") Title: " + currentJobTitle);
			
			String currentJobHiringManager = currentJobById.getHiringManager().getFirstName() + " " + currentJobById.getHiringManager().getLastName();
			System.out.println("   Hiring Manager: " + currentJobHiringManager);
			
			String currentJobHiringManagerEmail = currentJobById.getHiringManager().getEmail();
			System.out.println("   Hiring Manager Email: " + currentJobHiringManagerEmail + "\n");
		}
	}
}