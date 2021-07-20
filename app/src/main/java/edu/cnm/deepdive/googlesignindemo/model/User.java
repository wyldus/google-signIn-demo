package edu.cnm.deepdive.googlesignindemo.model;

import java.util.Date;

public class User {

  private Long id;

  private Date created;

  private Date connected;

  private String displayName;

  private String oauthKey;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Date getCreated() {
    return created;
  }

  public void setCreated(Date created) {
    this.created = created;
  }

  public Date getConnected() {
    return connected;
  }

  public void setConnected(Date connected) {
    this.connected = connected;
  }

  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public String getOauthKey() {
    return oauthKey;
  }

  public void setOauthKey(String oauthKey) {
    this.oauthKey = oauthKey;
  }
}
