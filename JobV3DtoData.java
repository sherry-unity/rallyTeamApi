import java.util.List;

public class JobV3DtoData
{
	private Integer id = null;
	private String reqId = null;
	private String type = null;
	private String status = null;
	private String statusValue = null;
	private String title = null;
	private String team = null;
	private Boolean isOnSite = null;
	private Boolean isRemote = null;
	private String startDate = null;
	private String publishedDate = null;
	private String description = null;
	private String requiredQualifications = null;
	private String desiredQualifications = null;
	private List<TagV3DtoData> requiredSkills = null;
	private UserShortV3DtoData hiringManager = null;
	private UserShortV3DtoData recruiter = null;
	private String category = null;
	private String level = null;
	private LocationV3DtoData location = null;
	private String url = null;
	private String applyUrl = null;
	private Integer createUserId = null;
	
	public Integer getId() 
	{
		return id;
	}
	
	public void setId(Integer id)
	{
		this.id = id;
	}
	
	public String getReqId()
	{
		return reqId;
	}
	
	public void setReqId(String reqId)
	{
		this.reqId = reqId;
	}
	
	public String getType() 
	{
		return type;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public String getStatus() 
	{
		return status;
	}
	
	public void setStatus(String status)
	{
		this.status = status;
	}
	
	public String getStatusValue()
	{
		return statusValue;
	}
	
	public void setStatusValue(String statusValue)
	{
		this.statusValue = statusValue;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public String getTeam()
	{
		return team;
	}
	
	public void setTeam(String team) 
	{
		this.team = team;
	}
	
	public Boolean getIsOnSite() 
	{
		return isOnSite;
	}
	
	public void setIsOnSite(Boolean isOnSite)
	{
		this.isOnSite = isOnSite;
	}
	
	public Boolean getIsRemote() 
	{
		return isRemote;
	}
	
	public void setIsRemote(Boolean isRemote)
	{
		this.isRemote = isRemote;
	}
	
	public String getStartDate() 
	{
		return startDate;
	}
	
	public void setStartDate(String startDate) 
	{
		this.startDate = startDate;
	}
	
	public String getPublishedDate() 
	{
		return publishedDate;
	}
	
	public void setPublishedDate(String publishedDate)
	{
		this.publishedDate = publishedDate;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public String getRequiredQualifications()
	{
		return requiredQualifications;
	}
	
	public void setRequiredQualifications(String requiredQualifications)
	{
		this.requiredQualifications = requiredQualifications;
	}
	
	public String getDesiredQualifications()
	{
		return desiredQualifications;
	}
	
	public void setDesiredQualifications(String desiredQualifications)
	{
		this.desiredQualifications = desiredQualifications;
	}
	
	public List<TagV3DtoData> getRequiredSkills()
	{
		return requiredSkills;
	}
	
	public void setRequiredSkills(List<TagV3DtoData> requiredSkills) 
	{
		this.requiredSkills = requiredSkills;
	}
	
	public UserShortV3DtoData getHiringManager()
	{
		return hiringManager;
	}
	
	public void setHiringManager(UserShortV3DtoData hiringManager)
	{
		this.hiringManager = hiringManager;
	}
	
	public UserShortV3DtoData getRecruiter() 
	{
		return recruiter;
	}
	
	public void setRecruiter(UserShortV3DtoData recruiter)
	{
		this.recruiter = recruiter;
	}
	
	public String getCategory()
	{
		return category;
	}
	
	public void setCategory(String category)
	{
		this.category = category;
	}
	
	public String getLevel() 
	{
		return level;
	}
	
	public void setLevel(String level) 
	{
		this.level = level;
	}
	
	public LocationV3DtoData getLocation()
	{
		return location;
	}
	
	public void setLocation(LocationV3DtoData location)
	{
		this.location = location;
	}
	
	public String getUrl() 
	{
		return url;
	}
	
	public void setUrl(String url) 
	{
		this.url = url;
	}
	
	public String getApplyUrl() 
	{
		return applyUrl;
	}
	
	public void setApplyUrl(String applyUrl)
	{
		this.applyUrl = applyUrl;
	}
	
	public Integer getCreateUserId() 
	{
		return createUserId;
	}
	
	public void setCreateUserId(Integer createUserId)
	{
		this.createUserId = createUserId;
	}
}