package com.enumExamples;

public enum Phone {

    NOKIA("N-20", "China", "2018"), SAMSUNG("J-15", "Korea", "2019"), INFINIX("A-16", "Brazil", "2020"),
    GIONEE("B-59", "Japan", "2018");

    private final String model;
    private final String country;
    private final String year;

    Phone(String model, String country, String year) {
        this.model = model;
        this.country = country;
        this.year = year;
    }

    public String getModel() {

    	return model;
    }

    public String getCountry() {

		return country;
    }

    public String getYear() {

    	return year;
    }

}
