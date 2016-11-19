package ex1.models;

public class Photo 
{
	private String pidpus;
	private String kartinka;
	
	public Photo()
	{
		super();
	}
	
	public Photo(String pidpus, String kartinka)
	{
		super();
		this.pidpus = pidpus;
		this.kartinka = kartinka;
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
	
}
