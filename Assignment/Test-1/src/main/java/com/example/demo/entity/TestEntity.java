package com.example.demo.entity;


import java.time.LocalDateTime;


import jakarta.persistence.*;


@Entity
public class TestEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private int end_year;
	private String citying;
	private String citylang;
	private String sector;
	private String topic;
	private String insight;
	private String swot;
	private String url;
	private String region;
	private int start_year;
	private int impact;
	private LocalDateTime date;
	private LocalDateTime publish;
	private String city;
	private String country;
	private int relevence;
	private String pestle;
	private String source;
	private String title;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getEnd_year() {
		return end_year;
	}
	public void setEnd_year(int end_year) {
		this.end_year = end_year;
	}
	public String getCitying() {
		return citying;
	}
	public void setCitying(String citying) {
		this.citying = citying;
	}
	public String getCitylang() {
		return citylang;
	}
	public void setCitylang(String citylang) {
		this.citylang = citylang;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getInsight() {
		return insight;
	}
	public void setInsight(String insight) {
		this.insight = insight;
	}
	public String getSwot() {
		return swot;
	}
	public void setSwot(String swot) {
		this.swot = swot;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public int getStart_year() {
		return start_year;
	}
	public void setStart_year(int start_year) {
		this.start_year = start_year;
	}
	public int getImpact() {
		return impact;
	}
	public void setImpact(int impact) {
		this.impact = impact;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public LocalDateTime getPublish() {
		return publish;
	}
	public void setPublish(LocalDateTime publish) {
		this.publish = publish;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getRelevence() {
		return relevence;
	}
	public void setRelevence(int relevence) {
		this.relevence = relevence;
	}
	public String getPestle() {
		return pestle;
	}
	public void setPestle(String pestle) {
		this.pestle = pestle;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLikelihood() {
		return likelihood;
	}
	public void setLikelihood(int likelihood) {
		this.likelihood = likelihood;
	}
	private int likelihood;
	
	
	
	
	

}
