package dakrory.a7med.cargomarine.Models;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

public class vehicalsDataAllList {
    @SerializedName("error")
    private String error;

    @SerializedName("data")
    private List<vehicalItemOfAllList> data;

    public class vehicalItemOfAllList{


        @SerializedName("id")
        private int id;


        @SerializedName("lastUpdateCar")
        private Date lastUpdateCar;

        @SerializedName("state")
        private int state;

        @SerializedName("shipper_firstName")
        private String shipper_firstName;


        @SerializedName("shipper_lastName")
        private String shipper_lastName;


        @SerializedName("shipperId")
        private int shipperId;


        @SerializedName("uuid")
        private String uuid;



        @SerializedName("make")
        private String make;


        @SerializedName("model")
        private String model;


        @SerializedName("year")
        private String year;


        @SerializedName("releaseOption")
        private int releaseOption;


        @SerializedName("url")
        private String url;


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getLastUpdateCar() {
            return lastUpdateCar;
        }

        public void setLastUpdateCar(Date lastUpdateCar) {
            this.lastUpdateCar = lastUpdateCar;
        }

        public String getShipper_firstName() {
            return shipper_firstName;
        }

        public void setShipper_firstName(String shipper_firstName) {
            this.shipper_firstName = shipper_firstName;
        }

        public String getShipper_lastName() {
            return shipper_lastName;
        }

        public void setShipper_lastName(String shipper_lastName) {
            this.shipper_lastName = shipper_lastName;
        }

        public int getShipperId() {
            return shipperId;
        }

        public void setShipperId(int shipperId) {
            this.shipperId = shipperId;
        }

        public String getUuid() {
            return uuid;
        }

        public void setUuid(String uuid) {
            this.uuid = uuid;
        }

        public String getMake() {
            return make;
        }

        public void setMake(String make) {
            this.make = make;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public int getReleaseOption() {
            return releaseOption;
        }

        public void setReleaseOption(int releaseOption) {
            this.releaseOption = releaseOption;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getState() {
            return state;
        }

        public void setState(int state) {
            this.state = state;
        }
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public List<vehicalItemOfAllList> getData() {
        return data;
    }

    public void setData(List<vehicalItemOfAllList> data) {
        this.data = data;
    }
}
