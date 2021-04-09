package responseServices;

public class GetDataAndSupportDetails {
    private GetSingleUserResponse.Data data;
    private GetSingleUserResponse.support support;

    public GetSingleUserResponse.Data getData() {
        return data;
    }

    public void setData(GetSingleUserResponse.Data data) {
        this.data = data;
    }

    public GetSingleUserResponse.support getSupport() {
        return support;
    }

    public void setSupport(GetSingleUserResponse.support support) {
        this.support = support;
    }
}
