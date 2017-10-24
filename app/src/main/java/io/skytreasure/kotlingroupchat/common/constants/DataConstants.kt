package io.skytreasure.kotlingroupchat.common.constants

import io.skytreasure.kotlingroupchat.chat.model.UserModel

/**
 * Created by akash on 23/10/17.
 */
class DataConstants {

    companion object {
        var userList: ArrayList<UserModel>? = ArrayList()
        var selectedUserList: ArrayList<UserModel>? = ArrayList()
        var mapList: MutableMap<String, UserModel> = mutableMapOf()
        var AdminUser: UserModel = UserModel()
    }
}