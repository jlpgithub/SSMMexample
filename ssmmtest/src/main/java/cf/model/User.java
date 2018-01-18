package cf.model;

import java.io.Serializable;

public class User implements Serializable {
    private String stuid;

    private String stuname;

    private Integer stuage;

    private String stuaddress;

    private static final long serialVersionUID = 1L;

    public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid == null ? null : stuid.trim();
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname == null ? null : stuname.trim();
    }

    public Integer getStuage() {
        return stuage;
    }

    public void setStuage(Integer stuage) {
        this.stuage = stuage;
    }

    public String getStuaddress() {
        return stuaddress;
    }

    public void setStuaddress(String stuaddress) {
        this.stuaddress = stuaddress == null ? null : stuaddress.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getStuid() == null ? other.getStuid() == null : this.getStuid().equals(other.getStuid()))
            && (this.getStuname() == null ? other.getStuname() == null : this.getStuname().equals(other.getStuname()))
            && (this.getStuage() == null ? other.getStuage() == null : this.getStuage().equals(other.getStuage()))
            && (this.getStuaddress() == null ? other.getStuaddress() == null : this.getStuaddress().equals(other.getStuaddress()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStuid() == null) ? 0 : getStuid().hashCode());
        result = prime * result + ((getStuname() == null) ? 0 : getStuname().hashCode());
        result = prime * result + ((getStuage() == null) ? 0 : getStuage().hashCode());
        result = prime * result + ((getStuaddress() == null) ? 0 : getStuaddress().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stuid=").append(stuid);
        sb.append(", stuname=").append(stuname);
        sb.append(", stuage=").append(stuage);
        sb.append(", stuaddress=").append(stuaddress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}