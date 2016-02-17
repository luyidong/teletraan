/**
 * Copyright 2016 Pinterest, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *     http://www.apache.org/licenses/LICENSE-2.0
 *    
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.pinterest.arcee.dao;

import com.pinterest.arcee.bean.AsgAlarmBean;
import com.pinterest.arcee.bean.MetricBean;

import java.util.List;

public interface AlarmDAO {
    AsgAlarmBean getAlarmInfoById(String alarmId) throws Exception;

    List<AsgAlarmBean> getAlarmInfosByGroup(String groupName) throws Exception;

    AsgAlarmBean getAlarmInfoByGroupAndMetricSource(String groupName, String metricSource) throws Exception;

    void insertAlarmInfo(AsgAlarmBean asgAlarmBean) throws Exception;

    void deleteAlarmInfoById(String alarmId)  throws Exception;

    void deleteAlarmInfoByGroup(String groupName) throws Exception;

    void updateAlarmInfoById(String alarmId, AsgAlarmBean asgAlarmBean) throws Exception;

    List<MetricBean> getMetrics() throws Exception;
}
