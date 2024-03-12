package com.vk.demo.model.user.userInfo;

import java.io.Serializable;
import java.util.Objects;

public class Company implements Serializable {

    private static final long serialVersionUID = 739237495531869880L;
    private String bs;
    private String catchPhrase;
    private String name;

    public Company() {

    }

    public Company(String bs, String catchPhrase, String name) {
        this.bs = bs;
        this.catchPhrase = catchPhrase;
        this.name = name;
    }

    public String getBs() {
        return bs;
    }

    public void setBs(String bs) {
        this.bs = bs;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Company{");
        sb.append("bs=").append(bs).append('\'');
        sb.append(", catchPhrase='").append(catchPhrase).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return bs.equals(company.bs)
                && catchPhrase.equals(company.catchPhrase)
                && name.equals(company.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bs, catchPhrase, name);
    }
}
