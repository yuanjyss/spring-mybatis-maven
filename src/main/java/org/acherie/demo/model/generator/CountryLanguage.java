package org.acherie.demo.model.generator;

public class CountryLanguage extends CountryLanguageKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column countrylanguage.IsOfficial
     *
     * @mbg.generated Sat Oct 08 08:10:25 CST 2016
     */
    private String isofficial;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column countrylanguage.Percentage
     *
     * @mbg.generated Sat Oct 08 08:10:25 CST 2016
     */
    private Float percentage;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column countrylanguage.IsOfficial
     *
     * @return the value of countrylanguage.IsOfficial
     *
     * @mbg.generated Sat Oct 08 08:10:25 CST 2016
     */
    public String getIsofficial() {
        return isofficial;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column countrylanguage.IsOfficial
     *
     * @param isofficial the value for countrylanguage.IsOfficial
     *
     * @mbg.generated Sat Oct 08 08:10:25 CST 2016
     */
    public void setIsofficial(String isofficial) {
        this.isofficial = isofficial == null ? null : isofficial.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column countrylanguage.Percentage
     *
     * @return the value of countrylanguage.Percentage
     *
     * @mbg.generated Sat Oct 08 08:10:25 CST 2016
     */
    public Float getPercentage() {
        return percentage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column countrylanguage.Percentage
     *
     * @param percentage the value for countrylanguage.Percentage
     *
     * @mbg.generated Sat Oct 08 08:10:25 CST 2016
     */
    public void setPercentage(Float percentage) {
        this.percentage = percentage;
    }
}