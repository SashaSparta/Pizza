package ex1.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "photo")
public class Photo 
{
	
	@Id
	@GeneratedValue
    private Long id;
	
	@NotEmpty
	private String pid;
	
	@NotEmpty
	@Size(min = 1, max = 10)
	private String pidpus;
	
	@NotEmpty
	private String kartinka;
	
	private Boolean isFirstInRow;
	

	public Photo()
	{
		super();
	}
	
	public Photo(String pidpus, String kartinka,Boolean isFirstInRow, String pid)
	{
		super();
		this.pid = pid;
		this.pidpus = pidpus;
		this.kartinka = kartinka;
		this.isFirstInRow = isFirstInRow;
	}
	
	public String getPid()
	{
		return pid;
	}
	public void setPid(String pid)
	{
		this.pid = pid;
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
