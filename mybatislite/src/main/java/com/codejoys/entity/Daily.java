package com.codejoys.entity;
/**
 * Demo class
 *
 * @author keriezhang
 * @date 2016/10/31
 */
public class Daily {
    private Long id;
    private String digest;

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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Daily{");
        sb.append("id=").append(id);
        sb.append(", digest='").append(digest).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
