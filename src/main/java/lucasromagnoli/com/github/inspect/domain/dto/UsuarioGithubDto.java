package lucasromagnoli.com.github.inspect.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UsuarioGithubDto {
	
	public final static String baseUrl = "https://api.github.com/";
	
	private String name;
	
	private String bio;
	
	@JsonProperty("avatar_url")
	private String avatarUrl;

	public String getName() {
		return name;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}
	
	
}
