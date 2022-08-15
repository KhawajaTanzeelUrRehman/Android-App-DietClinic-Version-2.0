package com.example.dietclinic.Models;

public class Users {
    String fullname, reference, referencename, referanceid, socialid,paymentmethod,
            amount,paymentdate,pakagechosen,paymentslip,phonenumber,gender,height,currentweight,
    weightaim,city,profession,timegetup,timesleep,physicalactivity,medicaldiagnose,currentmedication,
    foodallergies,foodchoices,rightthigh,leftthigh,waist,bellybutton,chest,claves,hips,comment,
    profilepic,userName,mail,password,userId;

    public Users(String fullname, String reference, String referencename, String referanceid,
                 String socialid, String paymentmethod, String amount, String paymentdate,
                 String pakagechosen, String paymentslip, String phonenumber, String gender,
                 String height, String currentweight, String weightaim, String city, String profession,
                 String timegetup, String timesleep, String physicalactivity, String medicaldiagnose,
                 String currentmedication, String foodallergies, String foodchoices, String rightthigh,
                 String leftthigh, String waist, String bellybutton, String chest, String claves,
                 String hips, String comment, String profilepic, String userName, String mail,
                 String password, String userId) {
        this.fullname = fullname;
        this.reference = reference;
        this.referencename = referencename;
        this.referanceid = referanceid;
        this.socialid = socialid;
        this.paymentmethod = paymentmethod;
        this.amount = amount;
        this.paymentdate = paymentdate;
        this.pakagechosen = pakagechosen;
        this.paymentslip = paymentslip;
        this.phonenumber = phonenumber;
        this.gender = gender;
        this.height = height;
        this.currentweight = currentweight;
        this.weightaim = weightaim;
        this.city = city;
        this.profession = profession;
        this.timegetup = timegetup;
        this.timesleep = timesleep;
        this.physicalactivity = physicalactivity;
        this.medicaldiagnose = medicaldiagnose;
        this.currentmedication = currentmedication;
        this.foodallergies = foodallergies;
        this.foodchoices = foodchoices;
        this.rightthigh = rightthigh;
        this.leftthigh = leftthigh;
        this.waist = waist;
        this.bellybutton = bellybutton;
        this.chest = chest;
        this.claves = claves;
        this.hips = hips;
        this.comment = comment;
        this.profilepic = profilepic;
        this.userName = userName;
        this.mail = mail;
        this.password = password;
        this.userId = userId;
    }
    public Users(){}
    //Signup Constructor
    public Users(String userName,String mail, String password){
        this.userName = userName;
        this.mail = mail;
        this.password = password;

    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getReferencename() {
        return referencename;
    }

    public void setReferencename(String referencename) {
        this.referencename = referencename;
    }

    public String getReferanceid() {
        return referanceid;
    }

    public void setReferanceid(String referanceid) {
        this.referanceid = referanceid;
    }

    public String getSocialid() {
        return socialid;
    }

    public void setSocialid(String socialid) {
        this.socialid = socialid;
    }

    public String getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPaymentdate() {
        return paymentdate;
    }

    public void setPaymentdate(String paymentdate) {
        this.paymentdate = paymentdate;
    }

    public String getPakagechosen() {
        return pakagechosen;
    }

    public void setPakagechosen(String pakagechosen) {
        this.pakagechosen = pakagechosen;
    }

    public String getPaymentslip() {
        return paymentslip;
    }

    public void setPaymentslip(String paymentslip) {
        this.paymentslip = paymentslip;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getCurrentweight() {
        return currentweight;
    }

    public void setCurrentweight(String currentweight) {
        this.currentweight = currentweight;
    }

    public String getWeightaim() {
        return weightaim;
    }

    public void setWeightaim(String weightaim) {
        this.weightaim = weightaim;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getTimegetup() {
        return timegetup;
    }

    public void setTimegetup(String timegetup) {
        this.timegetup = timegetup;
    }

    public String getTimesleep() {
        return timesleep;
    }

    public void setTimesleep(String timesleep) {
        this.timesleep = timesleep;
    }

    public String getPhysicalactivity() {
        return physicalactivity;
    }

    public void setPhysicalactivity(String physicalactivity) {
        this.physicalactivity = physicalactivity;
    }

    public String getMedicaldiagnose() {
        return medicaldiagnose;
    }

    public void setMedicaldiagnose(String medicaldiagnose) {
        this.medicaldiagnose = medicaldiagnose;
    }

    public String getCurrentmedication() {
        return currentmedication;
    }

    public void setCurrentmedication(String currentmedication) {
        this.currentmedication = currentmedication;
    }

    public String getFoodallergies() {
        return foodallergies;
    }

    public void setFoodallergies(String foodallergies) {
        this.foodallergies = foodallergies;
    }

    public String getFoodchoices() {
        return foodchoices;
    }

    public void setFoodchoices(String foodchoices) {
        this.foodchoices = foodchoices;
    }

    public String getRightthigh() {
        return rightthigh;
    }

    public void setRightthigh(String rightthigh) {
        this.rightthigh = rightthigh;
    }

    public String getLeftthigh() {
        return leftthigh;
    }

    public void setLeftthigh(String leftthigh) {
        this.leftthigh = leftthigh;
    }

    public String getWaist() {
        return waist;
    }

    public void setWaist(String waist) {
        this.waist = waist;
    }

    public String getBellybutton() {
        return bellybutton;
    }

    public void setBellybutton(String bellybutton) {
        this.bellybutton = bellybutton;
    }

    public String getChest() {
        return chest;
    }

    public void setChest(String chest) {
        this.chest = chest;
    }

    public String getClaves() {
        return claves;
    }

    public void setClaves(String claves) {
        this.claves = claves;
    }

    public String getHips() {
        return hips;
    }

    public void setHips(String hips) {
        this.hips = hips;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getProfilepic() {
        return profilepic;
    }

    public void setProfilepic(String profilepic) {
        this.profilepic = profilepic;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
