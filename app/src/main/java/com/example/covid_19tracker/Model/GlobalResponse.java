
package com.example.covid_19tracker.Model;


import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class GlobalResponse {

    @SerializedName("active")
    private Long mActive;
    @SerializedName("activePerOneMillion")
    private Double mActivePerOneMillion;
    @SerializedName("cases")
    private Long mCases;
    @SerializedName("casesPerOneMillion")
    private Long mCasesPerOneMillion;
    @SerializedName("continent")
    private String mContinent;
    @SerializedName("critical")
    private Long mCritical;
    @SerializedName("criticalPerOneMillion")
    private Double mCriticalPerOneMillion;
    @SerializedName("deaths")
    private Long mDeaths;
    @SerializedName("deathsPerOneMillion")
    private Long mDeathsPerOneMillion;
    @SerializedName("oneCasePerPeople")
    private Long mOneCasePerPeople;
    @SerializedName("oneDeathPerPeople")
    private Long mOneDeathPerPeople;
    @SerializedName("oneTestPerPeople")
    private Long mOneTestPerPeople;
    @SerializedName("population")
    private Long mPopulation;
    @SerializedName("recovered")
    private Long mRecovered;
    @SerializedName("recoveredPerOneMillion")
    private Double mRecoveredPerOneMillion;
    @SerializedName("tests")
    private Long mTests;
    @SerializedName("testsPerOneMillion")
    private Long mTestsPerOneMillion;
    @SerializedName("todayCases")
    private Long mTodayCases;
    @SerializedName("todayDeaths")
    private Long mTodayDeaths;
    @SerializedName("todayRecovered")
    private Long mTodayRecovered;

    public Long getActive() {
        return mActive;
    }

    public void setActive(Long active) {
        mActive = active;
    }

    public Double getActivePerOneMillion() {
        return mActivePerOneMillion;
    }

    public void setActivePerOneMillion(Double activePerOneMillion) {
        mActivePerOneMillion = activePerOneMillion;
    }

    public Long getCases() {
        return mCases;
    }

    public void setCases(Long cases) {
        mCases = cases;
    }

    public Long getCasesPerOneMillion() {
        return mCasesPerOneMillion;
    }

    public void setCasesPerOneMillion(Long casesPerOneMillion) {
        mCasesPerOneMillion = casesPerOneMillion;
    }

    public String getContinent() {
        return mContinent;
    }

    public void setContinent(String continent) {
        mContinent = continent;
    }

    public Long getCritical() {
        return mCritical;
    }

    public void setCritical(Long critical) {
        mCritical = critical;
    }

    public Double getCriticalPerOneMillion() {
        return mCriticalPerOneMillion;
    }

    public void setCriticalPerOneMillion(Double criticalPerOneMillion) {
        mCriticalPerOneMillion = criticalPerOneMillion;
    }

    public Long getDeaths() {
        return mDeaths;
    }

    public void setDeaths(Long deaths) {
        mDeaths = deaths;
    }

    public Long getDeathsPerOneMillion() {
        return mDeathsPerOneMillion;
    }

    public void setDeathsPerOneMillion(Long deathsPerOneMillion) {
        mDeathsPerOneMillion = deathsPerOneMillion;
    }

    public Long getOneCasePerPeople() {
        return mOneCasePerPeople;
    }

    public void setOneCasePerPeople(Long oneCasePerPeople) {
        mOneCasePerPeople = oneCasePerPeople;
    }

    public Long getOneDeathPerPeople() {
        return mOneDeathPerPeople;
    }

    public void setOneDeathPerPeople(Long oneDeathPerPeople) {
        mOneDeathPerPeople = oneDeathPerPeople;
    }

    public Long getOneTestPerPeople() {
        return mOneTestPerPeople;
    }

    public void setOneTestPerPeople(Long oneTestPerPeople) {
        mOneTestPerPeople = oneTestPerPeople;
    }

    public Long getPopulation() {
        return mPopulation;
    }

    public void setPopulation(Long population) {
        mPopulation = population;
    }

    public Long getRecovered() {
        return mRecovered;
    }

    public void setRecovered(Long recovered) {
        mRecovered = recovered;
    }

    public Double getRecoveredPerOneMillion() {
        return mRecoveredPerOneMillion;
    }

    public void setRecoveredPerOneMillion(Double recoveredPerOneMillion) {
        mRecoveredPerOneMillion = recoveredPerOneMillion;
    }

    public Long getTests() {
        return mTests;
    }

    public void setTests(Long tests) {
        mTests = tests;
    }

    public Long getTestsPerOneMillion() {
        return mTestsPerOneMillion;
    }

    public void setTestsPerOneMillion(Long testsPerOneMillion) {
        mTestsPerOneMillion = testsPerOneMillion;
    }

    public Long getTodayCases() {
        return mTodayCases;
    }

    public void setTodayCases(Long todayCases) {
        mTodayCases = todayCases;
    }

    public Long getTodayDeaths() {
        return mTodayDeaths;
    }

    public void setTodayDeaths(Long todayDeaths) {
        mTodayDeaths = todayDeaths;
    }

    public Long getTodayRecovered() {
        return mTodayRecovered;
    }

    public void setTodayRecovered(Long todayRecovered) {
        mTodayRecovered = todayRecovered;
    }

}
