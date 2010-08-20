/**
 *  Copyright (C) 2010 Cloud.com, Inc.  All rights reserved.
 * 
 * This software is licensed under the GNU General Public License v3 or later.
 * 
 * It is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */
package com.cloud.api.commands;

import org.apache.log4j.Logger;

import com.cloud.api.BaseCmd;
import com.cloud.api.Implementation;
import com.cloud.api.Parameter;
import com.cloud.api.BaseCmd.Manager;

@Implementation(method="lockUser", manager=Manager.ManagementServer)
public class LockUserCmd extends BaseCmd {
    public static final Logger s_logger = Logger.getLogger(LockUserCmd.class.getName());

    private static final String s_name = "lockuserresponse";

    /////////////////////////////////////////////////////
    //////////////// API parameters /////////////////////
    /////////////////////////////////////////////////////

    @Parameter(name="id", type=CommandType.LONG, required=true)
    private Long id;

    /////////////////////////////////////////////////////
    /////////////////// Accessors ///////////////////////
    /////////////////////////////////////////////////////

    public Long getId() {
        return id;
    }

    /////////////////////////////////////////////////////
    /////////////// API Implementation///////////////////
    /////////////////////////////////////////////////////

    public String getName() {
        return s_name;
    }

//    @Override
//    public List<Pair<String, Object>> execute(Map<String, Object> params) {
//        Account adminAccount = (Account)params.get(BaseCmd.Properties.ACCOUNT_OBJ.getName());
//        Long id = (Long)params.get(BaseCmd.Properties.ID.getName());
//
//        // Check if user with id exists in the system
//        User user = getManagementServer().findUserById(id);
//        if (user == null) {
//            throw new ServerApiException(BaseCmd.ACCOUNT_ERROR, "Unable to find user by id");
//        } else if (user.getRemoved() != null) {
//            throw new ServerApiException(BaseCmd.ACCOUNT_ERROR, "Unable to find user by id");
//        }
//
//        // If the user is a System user, return an error.  We do not allow this
//        Account account = getManagementServer().findAccountById(user.getAccountId());
//        if ((account != null) && (account.getId() == Account.ACCOUNT_ID_SYSTEM)) {
//            throw new ServerApiException(BaseCmd.ACCOUNT_ERROR, "user id : " + id + " is a system user, locking is not allowed");
//        }
//
//        if ((adminAccount != null) && !getManagementServer().isChildDomain(adminAccount.getDomainId(), account.getDomainId())) {
//            throw new ServerApiException(BaseCmd.ACCOUNT_ERROR, "Failed to lock user " + id + ", permission denied.");
//        }
//
//        boolean success = getManagementServer().lockUser(id.longValue());
//        List<Pair<String, Object>> returnValues = new ArrayList<Pair<String, Object>>();
//        returnValues.add(new Pair<String, Object>(BaseCmd.Properties.SUCCESS.getName(), Boolean.valueOf(success).toString()));
//        return returnValues;
//    }

	@Override
	public String getResponse() {
		// TODO Auto-generated method stub
		return null;
	}
}
