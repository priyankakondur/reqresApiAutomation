package responseServices;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetDataAndSupportForListOfUsers {
    private GetSingleUserResponse.Data[] data;
    private GetSingleUserResponse.support support;

    public GetSingleUserResponse.Data[] getData() {
        return data;
    }

    public void setData(GetSingleUserResponse.Data[] data) {
        this.data = data;
    }

    public GetSingleUserResponse.support getSupport() {
        return support;
    }

    public void setSupport(GetSingleUserResponse.support support) {
        this.support = support;
    }

    private String page;
    @JsonProperty("per_page")
    private String perPage;
    private String total;

    public String getPerPage() {
        return perPage;
    }

    public void setPerPage(String perPage) {
        this.perPage = perPage;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(String totalPages) {
        this.totalPages = totalPages;
    }

    @JsonProperty("total_pages")
    private String totalPages;

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }


}
