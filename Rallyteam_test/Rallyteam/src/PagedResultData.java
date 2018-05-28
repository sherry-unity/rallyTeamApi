import java.util.List;

public class PagedResultData 
{
	private List<JobShortV3DtoData> data = null;
	private Integer totalCount = null;
	private Integer currentPage = null;
	private Integer totalPages = null;
	private Integer pageSize = null;
	private Integer lastItemId = null;
	private Integer itemsLeftCount = null;
	
	public List<JobShortV3DtoData> getData() 
	{
		return data;
	}
	
	public void setData(List<JobShortV3DtoData> data) 
	{
		this.data = data;
	}
	
	public Integer getTotalCount()
	{
		return totalCount;
	}
	
	public void setTotalCount(Integer totalCount)
	{
		this.totalCount = totalCount;
	}
	
	public Integer getCurrentPage()
	{
		return currentPage;
	}
	
	public void setCurrentPage(Integer currentPage)
	{
		this.currentPage = currentPage;
	}
	
	public Integer getTotalPages()
	{
		return totalPages;
	}
	
	public void setTotalPages(Integer totalPages)
	{
		this.totalPages = totalPages;
	}
	
	public Integer getPageSize()
	{
		return pageSize;
	}
	
	public void setPageSize(Integer pageSize)
	{
		this.pageSize = pageSize;
	}
	
	public Integer getLastItemId()
	{
		return lastItemId;
	}
	
	public void setLastItemId(Integer lastItemId) 
	{
		this.lastItemId = lastItemId;
	}
	
	public Integer getItemsLeftCount()
	{
		return itemsLeftCount;
	}
	
	public void setItemsLeftCount(Integer itemsLeftCount) 
	{
		this.itemsLeftCount = itemsLeftCount;
	}
}
