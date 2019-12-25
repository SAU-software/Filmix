package com.homeless.filmix.network.tvshows;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class TVCastsOfPersonResponse {

    @SerializedName("cast")
    private List<TVCastOfPerson> casts;
    //crew missing
    @SerializedName("id")
    private Integer id;

    public TVCastsOfPersonResponse(List<TVCastOfPerson> casts, Integer id) {
        this.casts = casts;
        this.id = id;
    }

    public List<TVCastOfPerson> getCasts() {
        return casts;
    }

    public void setCasts(List<TVCastOfPerson> casts) {
        this.casts = casts;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
