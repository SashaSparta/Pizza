package ex1.models;

public class Photo 
{
	private String pidpus;
	private String kartinka;
	private Boolean isFirstInRow;
	

	public Photo()
	{
		super();
	}
	
	public Photo(String pidpus, String kartinka,Boolean isFirstInRow)
	{
		super();
		this.pidpus = pidpus;
		this.kartinka = kartinka;
		this.isFirstInRow = isFirstInRow;
	}
	public String getPidpus()
	{
		return pidpus;
	}
	public void setPidpus(String pidpus)
	{
		this.pidpus = pidpus;
	}
	
	public String getKartinka()
	{
		return kartinka;
	}
	public void setKartinka(String kartinka)
	{
		this.kartinka = kartinka;
	}
	public Boolean getIsFirstInRow() {
		return isFirstInRow;
	}
	public void setIsFirstInRow(Boolean isFirstInRow) {
		this.isFirstInRow = isFirstInRow;
	}
	
}
