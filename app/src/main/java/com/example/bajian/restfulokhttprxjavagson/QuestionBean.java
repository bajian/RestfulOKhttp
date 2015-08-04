package com.example.bajian.restfulokhttprxjavagson;

import java.util.List;

/**
 * Created by hgx on 2015/8/4.
 */
public class QuestionBean {

    /**
     * data : [{"upload_time":"1186197319","update_time":"2015-08-04 11:15:39","to_relative":"0","users_id":"14135","allocate_times":"5","id":"38630","pic":"upload/img/15-08-04/14386581192342707.jpeg","audio":"","state":"81","audio_text":""},{"upload_time":"1438656837","update_time":"2015-08-04 10:55:46","to_relative":"0","users_id":"10913","allocate_times":"5","id":"38629","pic":"upload/img/15-08-04/143865683883478140.jpeg","audio":"","state":"81","audio_text":"请问这本书的名字叫什么？"},{"upload_time":"1438656552","update_time":"2015-08-04 10:50:09","to_relative":"0","users_id":"13189","allocate_times":"3","id":"38628","pic":"upload/img/15-08-04/143865655191680537.jpeg","audio":"upload/audio/15-08-04/143865655432896810.mp3","state":"81","audio_text":""},{"upload_time":"1438656428","update_time":"2015-08-04 10:47:35","to_relative":"0","users_id":"13189","allocate_times":"2","id":"38627","pic":"upload/img/15-08-04/143865642777820840.jpeg","audio":"upload/audio/15-08-04/143865643096154648.mp3","state":"81","audio_text":""},{"upload_time":"1438656314","update_time":"2015-08-04 10:45:34","to_relative":"0","users_id":"13189","allocate_times":"4","id":"38626","pic":"upload/img/15-08-04/14386563141931250.jpeg","audio":"upload/audio/15-08-04/143865631663138917.mp3","state":"81","audio_text":""},{"upload_time":"1438653227","update_time":"2015-08-04 09:55:53","to_relative":"0","users_id":"12423","allocate_times":"4","id":"38625","pic":"upload/img/15-08-04/143865331866478938.jpeg","audio":"","state":"81","audio_text":"请问这是多少钱\n"},{"upload_time":"1438651085","update_time":"2015-08-04 09:19:20","to_relative":"0","users_id":"14226","allocate_times":"2","id":"38624","pic":"upload/img/15-08-04/143865108473512544.jpeg","audio":"","state":"81","audio_text":"时间太长他给我返回了。怎么会有两个。"},{"upload_time":"1186189763","update_time":"2015-08-04 09:13:53","to_relative":"0","users_id":"14189","allocate_times":"2","id":"38623","pic":"upload/img/15-08-04/143865056545164839.jpeg","audio":"","state":"81","audio_text":""},{"upload_time":"1438650316","update_time":"2015-08-04 09:16:09","to_relative":"0","users_id":"14226","allocate_times":"2","id":"38622","pic":"upload/img/15-08-04/143865031572777350.jpeg","audio":"","state":"81","audio_text":""},{"upload_time":"1438648502","update_time":"2015-08-04 09:15:30","to_relative":"0","users_id":"12061","allocate_times":"2","id":"38621","pic":"upload/img/15-08-04/143864850291105627.jpeg","audio":"","state":"81","audio_text":""},{"upload_time":"1438646447","update_time":"2015-08-04 09:14:43","to_relative":"0","users_id":"12032","allocate_times":"2","id":"38620","pic":"upload/img/15-08-04/143864644840759639.jpeg","audio":"upload/audio/15-08-04/14386464553035691.mp3","state":"81","audio_text":""},{"upload_time":"1438617517","update_time":"2015-08-04 07:01:28","to_relative":"0","users_id":"14458","allocate_times":"2","id":"38618","pic":"upload/wechat/img/15-08-03/04242001438617517.jpeg","audio":"","state":"81","audio_text":"一面的文字告诉我"},{"upload_time":"1438617516","update_time":"2015-08-04 07:00:51","to_relative":"0","users_id":"14458","allocate_times":"2","id":"38617","pic":"upload/wechat/img/15-08-03/33387001438617516.jpeg","audio":"","state":"81","audio_text":""},{"upload_time":"1438610195","update_time":"2015-08-03 22:01:34","to_relative":"0","users_id":"14248","allocate_times":"2","id":"38615","pic":"upload/img/15-08-03/143861020241859616.jpeg","audio":"upload/audio/15-08-03/143861020777725125.mp3","state":"81","audio_text":""},{"upload_time":"1438608888","update_time":"2015-08-03 22:01:08","to_relative":"0","users_id":"12041","allocate_times":"2","id":"38614","pic":"upload/img/15-08-03/143860888898648226.jpeg","audio":"","state":"81","audio_text":""},{"upload_time":"1438608792","update_time":"2015-08-03 22:00:51","to_relative":"0","users_id":"12041","allocate_times":"2","id":"38613","pic":"upload/img/15-08-03/143860879255955948.jpeg","audio":"","state":"81","audio_text":""},{"upload_time":"1438607139","update_time":"2015-08-03 21:07:56","to_relative":"0","users_id":"10962","allocate_times":"2","id":"38612","pic":"upload/img/15-08-03/143860714048358518.jpeg","audio":"","state":"81","audio_text":"这是什么图片"},{"upload_time":"1438606260","update_time":"2015-08-03 20:54:39","to_relative":"0","users_id":"12783","allocate_times":"2","id":"38611","pic":"upload/img/15-08-03/1438606285937611.jpeg","audio":"","state":"81","audio_text":""},{"upload_time":"1438605864","update_time":"2015-08-03 20:48:44","to_relative":"0","users_id":"12783","allocate_times":"2","id":"38610","pic":"upload/img/15-08-03/14386058862693019.jpeg","audio":"","state":"81","audio_text":""},{"upload_time":"1186144137","update_time":"2015-08-03 20:30:55","to_relative":"0","users_id":"14415","allocate_times":"2","id":"38609","pic":"upload/img/15-08-03/143860493992059110.jpeg","audio":"","state":"81","audio_text":""}]
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
