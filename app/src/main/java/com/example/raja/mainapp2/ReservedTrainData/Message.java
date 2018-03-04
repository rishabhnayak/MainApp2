
package com.example.raja.mainapp2.ReservedTrainData;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Message {

    @SerializedName("trainBtwnStnsList")
    @Expose
    private List<TrainBtwnStnsList> trainBtwnStnsList = null;
    @SerializedName("quotaList")
    @Expose
    private List<String> quotaList = null;
    @SerializedName("serverId")
    @Expose
    private String serverId;
    @SerializedName("timeStamp")
    @Expose
    private String timeStamp;
    @SerializedName("generatedTimeStamp")
    @Expose
    private GeneratedTimeStamp generatedTimeStamp;

    public List<TrainBtwnStnsList> getTrainBtwnStnsList() {
        return trainBtwnStnsList;
    }

    public void setTrainBtwnStnsList(List<TrainBtwnStnsList> trainBtwnStnsList) {
        this.trainBtwnStnsList = trainBtwnStnsList;
    }

    public List<String> getQuotaList() {
        return quotaList;
    }

    public void setQuotaList(List<String> quotaList) {
        this.quotaList = quotaList;
    }

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public GeneratedTimeStamp getGeneratedTimeStamp() {
        return generatedTimeStamp;
    }

    public void setGeneratedTimeStamp(GeneratedTimeStamp generatedTimeStamp) {
        this.generatedTimeStamp = generatedTimeStamp;
    }

}
