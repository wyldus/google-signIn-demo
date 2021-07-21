package edu.cnm.deepdive.googlesignindemo.model;

import com.google.gson.annotations.Expose;
import java.util.Date;

public class User {

  @Expose
  private Long id;

  @Expose
  private Date created;

  @Expose
  private Date connected;

  @Expose
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
