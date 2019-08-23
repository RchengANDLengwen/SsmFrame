package io.gitee.hchaojie.entity;

import java.util.Date;

public class Daily {
    private Long id;


    private String digest;
    private String content;


    private Date created;

    private Integer views;
    private Integer stars;
    private Integer favorites;
    private Long updatedBy;

    private String codeUrl;

    private User user;

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    public Integer getFavorites() {
        return favorites;
    }

    public void setFavorites(Integer favorites) {
        this.favorites = favorites;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    private Character status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Daily{");
        sb.append("id=").append(id);
        sb.append(", digest='").append(digest).append('\'');
        sb.append(", content='").append(content).append('\'');
        sb.append(", created=").append(created);
        sb.append(", views=").append(views);
        sb.append(", stars=").append(stars);
        sb.append(", favorites=").append(favorites);
        sb.append(", updatedBy=").append(updatedBy);
        sb.append(", codeUrl='").append(codeUrl).append('\'');
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }

    public String getCodeUrl() {
        return codeUrl;
    }

    public void setCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
