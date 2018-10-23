package com.example.bar;

import com.example.bar.dto.ScheduleElement;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ScheduleService {
    @GET("schedule")
    Call<List<ScheduleElement>> getSchedule();
}
