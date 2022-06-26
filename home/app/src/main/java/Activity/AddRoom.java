package Activity;

public class AddRoom {
    String tv_name;
    int im_ic;

    public AddRoom() {
    }

    public AddRoom(String tv_name, int im_ic) {
        this.tv_name = tv_name;
        this.im_ic = im_ic;
    }

    public String getTv_name() {
        return tv_name;
    }

    public void setTv_name(String tv_name) {
        this.tv_name = tv_name;
    }

    public int getIm_ic() {
        return im_ic;
    }

    public void setIm_ic(int im_ic) {
        this.im_ic = im_ic;
    }
}
