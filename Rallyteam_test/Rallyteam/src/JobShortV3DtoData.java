public class JobShortV3DtoData
{
	private Integer id = null;
	private String title = null;
	private String team = null;
	private String category = null;
	private String description = null;
	private String publishedDate = null;
	private String status = null;
	private String statusValue = null;
	private Integer matchPercent = null;
	private LocationV3DtoData location = null;
	private Integer hiringManagerId = null;
	private Integer createUserId = null;
	private Boolean isOnSite = null;
	private Boolean isRemote = null;
	
	public Integer getId() 
	{
		return id;
	}
	
	public void setId(Integer id)
	{
		this.id = id;
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
	
	public String getCategory()
	{
		return category;
	}
	
	public void setCategory(String category)
	{
		this.category = category;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public void setDescription(String description) 
	{
		this.description = description;
	}
	
	public String getPublishedDate()
	{
		return publishedDate;
	}
	
	public void setPublishedDate(String publishedDate)
	{
		this.publishedDate = publishedDate;
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
	
	public Integer getMatchPercent() 
	{
		return matchPercent;
	}
	
	public void setMatchPercent(Integer matchPercent)
	{
		this.matchPercent = matchPercent;
	}
	
	public LocationV3DtoData getLocation()
	{
		return location;
	}
	
	public void setLocation(LocationV3DtoData location)
	{
		this.location = location;
	}
	
	public Integer getHiringManagerId()
	{
		return hiringManagerId;
	}
	
	public void setHiringManagerId(Integer hiringManagerId)
	{
		this.hiringManagerId = hiringManagerId;
	}
	
	public Integer getCreateUserId()
	{
		return createUserId;
	}
	
	public void setCreateUserId(Integer createUserId)
	{
		this.createUserId = createUserId;
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
}
