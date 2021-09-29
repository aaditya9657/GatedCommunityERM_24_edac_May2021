package hibernate;

import javax.persistence.Column;

public class FilePath 
{
	@Column(name="file_path" ,unique=true)
	private String file_path;

	public String getFile_path() 
	{
		return file_path;
	}

	public void setFile_path(String file_path) 
	{
		this.file_path = file_path;
	}

}
