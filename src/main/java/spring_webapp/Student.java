package spring_webapp;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class Student {
	
	@NotNull(message="Obrigatório")
	@NotBlank(message="Obrigatório")
	private String firstName;
	@Size(min=1, message="Pelo menos 1 char")
	private String lastName;
	private String country;
	@NotNull(message="Obrigatório")
	@Min(value=10, message="Não pode ser menor que 10")
	@Max(value=100, message="Não pode ser maior que 100")
	private Integer age;
	
	private LinkedHashMap <String, String> countryOptions;
	
	private String favoriteLanguage;
	private String[] operationSystems;

	
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public void setOperationSystems(String[] operationSystems) {
		System.out.println(operationSystems.toString());
		this.operationSystems = operationSystems;
	}
	
	public String[] getOperationSystems() {
		System.out.println(operationSystems);
		return operationSystems;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Student() {
		countryOptions = new LinkedHashMap<String, String>();
		
		countryOptions.put("BR", "Brazil");
		countryOptions.put("GE", "Germany");
		countryOptions.put("FR", "France");
		countryOptions.put("IN", "India");
		
	}

	public String getFirstName() {
		return firstName;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
