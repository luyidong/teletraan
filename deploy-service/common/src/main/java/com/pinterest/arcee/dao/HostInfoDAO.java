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

import com.pinterest.arcee.bean.GroupBean;
import com.pinterest.deployservice.bean.HostBean;

import java.util.List;
import java.util.Set;

/**
 * A collection of methods to get host information
 * TODO this is NOT a DAO, but CloudProvider, need to refactor
 */
public interface HostInfoDAO {
    Set<String> getTerminatedHosts(Set<String> ids) throws Exception;

    void terminateHost(String hostId) throws Exception;

    List<HostBean> launchEC2Instances(GroupBean groupBean, int instanceCnt, String subnet) throws Exception;

    List<String> getRunningInstances(List<String> runningIds) throws Exception;
}
