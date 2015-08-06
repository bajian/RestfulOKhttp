package com.example.bajian.restfulokhttprxjavagson;

import java.util.List;

/**
 * Created by hgx on 2015/8/4.
 */
public class QuestionBean {

    /**
     * data :
     * extra :
     * message :
     * status : 000000
     */
    private List<DataEntity> data;
    private String extra;
    private String message;
    private String status;

    public void setData(List<DataEntity> data) {
        this.data = data;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<DataEntity> getData() {
        return data;
    }

    public String getExtra() {
        return extra;
    }

    public String getMessage() {
        return message;
    }

    public String getStatus() {
        return status;
    }

    public static class DataEntity {
        /**
         * upload_time : 1186197319
         * update_time : 2015-08-04 11:15:39
         * to_relative : 0
         * users_id : 14135
         * allocate_times : 5
         * id : 38630
         * pic : upload/img/15-08-04/14386581192342707.jpeg
         * audio :
         * state : 81
         * audio_text :
         */
        private String upload_time;
        private String update_time;
        private String to_relative;
        private String users_id;
        private String allocate_times;
        private String id;
        private String pic;
        private String audio;
        private String state;
        private String audio_text;

        public void setUpload_time(String upload_time) {
            this.upload_time = upload_time;
        }

        public void setUpdate_time(String update_time) {
            this.update_time = update_time;
        }

        public void setTo_relative(String to_relative) {
            this.to_relative = to_relative;
        }

        public void setUsers_id(String users_id) {
            this.users_id = users_id;
        }

        public void setAllocate_times(String allocate_times) {
            this.allocate_times = allocate_times;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setPic(String pic) {
            this.pic = pic;
        }

        public void setAudio(String audio) {
            this.audio = audio;
        }

        public void setState(String state) {
            this.state = state;
        }

        public void setAudio_text(String audio_text) {
            this.audio_text = audio_text;
        }

        public String getUpload_time() {
            return upload_time;
        }

        public String getUpdate_time() {
            return update_time;
        }

        public String getTo_relative() {
            return to_relative;
        }

        public String getUsers_id() {
            return users_id;
        }

        public String getAllocate_times() {
            return allocate_times;
        }

        public String getId() {
            return id;
        }

        public String getPic() {
            return pic;
        }

        public String getAudio() {
            return audio;
        }

        public String getState() {
            return state;
        }

        public String getAudio_text() {
            return audio_text;
        }
    }
}
