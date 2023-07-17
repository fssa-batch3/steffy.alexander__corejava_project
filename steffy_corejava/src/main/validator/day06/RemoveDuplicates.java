package day06;

import java.util.List;
import java.util.ArrayList;

public class RemoveDuplicates {
	public List<String> cityList;
	public List<String> newList;

	public RemoveDuplicates() {
		cityList = new ArrayList<>();
		newList = new ArrayList<>();
	}

	public List<String> getCityList() {
		return cityList;
	}

	public void setCityList(List<String> cityList) {
		this.cityList = cityList;
	}

	public List<String> getNewList() {
		return newList;
	}

	public void setNewList(List<String> newList) {
		this.newList = newList;
	}
}