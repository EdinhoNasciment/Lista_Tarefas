package br.edu.ifsp.dmo.listatarefas.view;

public class Constants {
    public static final String TAG = "LISTA TAREFAS APP";
    //Storage for system users
    public static final String FILE_USERS = "user_db";
    public static final String TABLE_USERS = "users";
    public static final String ATTR_USERNAME = "username";
    public static final String ATTR_PASSWORD = "password";
    //Storage for last user login
    public static final String TABLE_SAVED_USER = "user";
    public static final String ATTR_SAVE_LOGIN = "save_login";
    //Storage for Task
    public static final String FILE_TASK_PREFIX = "tasks_by_";
    public static final String TABLE_TASK = "tasks";
    public static final String ATTR_TASK_TITLE = "title";
    public static final String ATTR_TASK_DESCRIPTION = "description";
    //Activities communication
    public static final String KEY_USER = "user";
    public static final String KEY_TASK_POSITION = "position";

}
