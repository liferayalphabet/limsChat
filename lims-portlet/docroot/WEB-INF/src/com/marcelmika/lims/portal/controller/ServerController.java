/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Marcel Mika, marcelmika.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.marcelmika.lims.portal.controller;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.marcelmika.lims.portal.domain.ServerTime;
import com.marcelmika.lims.portal.http.HttpStatus;
import com.marcelmika.lims.portal.response.ResponseUtil;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Ing. Marcel Mika
 * @link http://marcelmika.com
 * Date: 15/09/14
 * Time: 15:35
 */
public class ServerController {

    // Log
    @SuppressWarnings("unused")
    private static Log log = LogFactoryUtil.getLog(ServerController.class);


    /**
     * Returns current server time
     *
     * @param request  ResourceRequest
     * @param response ResourceResponse
     */
    public void getServerTime(ResourceRequest request, ResourceResponse response) {

        // Get current server time
        Date time = Calendar.getInstance().getTime();

        // Store in object
        ServerTime serverTime = new ServerTime();
        serverTime.setTime(time);

        // Serialize
        String serializedTime = JSONFactoryUtil.looseSerialize(serverTime);

        // Write to response
        ResponseUtil.writeResponse(serializedTime, HttpStatus.OK, response);
    }
}
