package com.robosoft.lorem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class mobileOtp
{
    private String mobileNo;
    private String otpExpireTime;
    private int otpNumber;
    private boolean otpVerified;


}
