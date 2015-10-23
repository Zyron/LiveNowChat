package com.firebase.androidchat;

/**
 * Created by ruiyang on 15/10/24.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class userModel {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("Name")
    @Expose
    private String Name;
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;
    @SerializedName("PasswordHASH")
    @Expose
    private Object PasswordHASH;
    @SerializedName("CreatedDate")
    @Expose
    private Object CreatedDate;
    @SerializedName("PictureURL")
    @Expose
    private String PictureURL;

    /**
     *
     * @return
     * The id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The Name
     */
    public String getName() {
        return Name;
    }

    /**
     *
     * @param Name
     * The Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     *
     * @return
     * The PhoneNumber
     */
    public String getPhoneNumber() {
        return PhoneNumber;
    }

    /**
     *
     * @param PhoneNumber
     * The PhoneNumber
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     *
     * @return
     * The PasswordHASH
     */
    public Object getPasswordHASH() {
        return PasswordHASH;
    }

    /**
     *
     * @param PasswordHASH
     * The PasswordHASH
     */
    public void setPasswordHASH(Object PasswordHASH) {
        this.PasswordHASH = PasswordHASH;
    }

    /**
     *
     * @return
     * The CreatedDate
     */
    public Object getCreatedDate() {
        return CreatedDate;
    }

    /**
     *
     * @param CreatedDate
     * The CreatedDate
     */
    public void setCreatedDate(Object CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    /**
     *
     * @return
     * The PictureURL
     */
    public String getPictureURL() {
        return PictureURL;
    }

    /**
     *
     * @param PictureURL
     * The PictureURL
     */
    public void setPictureURL(String PictureURL) {
        this.PictureURL = PictureURL;
    }

}

