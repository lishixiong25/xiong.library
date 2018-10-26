package com.lishixiong.model;

/**
 * @author lishixiong
 * @since 2018/10/26 13:41
 * Singularity Sky Technologies Limited.
 */
public  abstract class Person  extends Library {
  private String name;
  private String gender;
  private String ageGrop;
  private String dressed;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getAgeGrop() {
    return ageGrop;
  }

  public void setAgeGrop(String ageGrop) {
    this.ageGrop = ageGrop;
  }

  public String getDressed() {
    return dressed;
  }

  public void setDressed(String dressed) {
    this.dressed = dressed;
  }
}
