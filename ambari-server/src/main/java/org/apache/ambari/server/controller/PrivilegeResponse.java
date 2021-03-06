/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ambari.server.controller;


import org.apache.ambari.server.orm.entities.PrincipalTypeEntity.PrincipalType;
import org.apache.ambari.server.security.authorization.ResourceType;

import io.swagger.annotations.ApiModelProperty;


public abstract class PrivilegeResponse implements ApiModel {
  protected String permissionLabel;
  protected Integer privilegeId;
  protected String permissionName;
  protected PrincipalType principalType;
  protected String principalName;
  protected ResourceType type;
  protected String clusterName;
  protected String viewName;
  protected String version;
  protected String instanceName;


  /**
   * Returns permission label
   * @return permission label
   */
  @ApiModelProperty(name = "PrivilegeInfo/permission_label")
  public String getPermissionLabel() {
    return permissionLabel;
  }

  /**
   * Returns principal name
   * @return principal name
   */
  @ApiModelProperty(name = "PrivilegeInfo/principal_name")
  public String getPrincipalName() {
    return principalName;
  }

  /**
   * Sets principal name
   * @param principalName  principal name
   */
  public void setPrincipalName(String principalName) {
    this.principalName = principalName;
  }

  /**
   * Returns privilege id
   * @return  privilege id
   */
  @ApiModelProperty(name = "PrivilegeInfo/privilege_id")
  public Integer getPrivilegeId() {
    return privilegeId;
  }

  /**
   * Returns permission name
   * @return permission name
   */
  @ApiModelProperty(name = "PrivilegeInfo/permission_name")
  public String getPermissionName() {
    return permissionName;
  }

  /**
   * Returns principal type
   * @return principal type
   */
  @ApiModelProperty(name = "PrivilegeInfo/principal_type")
  public PrincipalType getPrincipalType() {
    return principalType;
  }

  /**
   * Returns resource type
   * @return resource type
   */
  @ApiModelProperty(name = "PrivilegeInfo/type")
  public ResourceType getType() {
    return type;
  }

  /**
   * Sets resource type
   * @param type resource type
   */
  public void setType(ResourceType type) {
    this.type = type;
  }

  /**
   * Returns cluster name
   * @return cluster name
   */
  @ApiModelProperty(name = "PrivilegeInfo/cluster_name")
  public String getClusterName() {
    return clusterName;
  }

  /**
   * Sets cluster name
   * @param clusterName cluster name
   */
  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  /**
   * Returns view name
   * @return view name
   */
  @ApiModelProperty(name = "PrivilegeInfo/view_name")
  public String getViewName() {
    return viewName;
  }

  /**
   * Sets view name
   * @param viewName  view name
   */
  public void setViewName(String viewName) {
    this.viewName = viewName;
  }

  /**
   * Returns view version
   * @return view version
   */
  @ApiModelProperty(name = "PrivilegeInfo/version")
  public String getVersion() {
    return version;
  }

  /**
   * Sets view version
   * @param version view version
   */
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * Returns view instance name
   * @return view instance name
   */
  @ApiModelProperty(name = "PrivilegeInfo/instance_name")
  public String getInstanceName() {
    return instanceName;
  }

  public void setInstanceName(String instanceName) {
    this.instanceName = instanceName;
  }

}
