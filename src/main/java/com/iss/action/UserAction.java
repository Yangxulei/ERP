package com.iss.action;

import com.opensymphony.xwork2.ActionContext;  
import com.opensymphony.xwork2.ActionSupport;  
  
public class UserAction extends ActionSupport{  
    private String username;  
    private String password;  
    public String getUsername() {  
        return username;  
    }  
    public void setUsername(String username) {  
        this.username = username;  
    }  
    public String getPassword() {  
        return password;  
    }  
    public void setPassword(String password) {  
        this.password = password;  
    }  
    public String execute(){  
        if(getUsername().equals("linbo") && getPassword().equals("123456")){  
              
            ActionContext.getContext().put("user", getUsername());//ͨ��ActionContext�������webӦ�õ�Session,����һ��Map  
                        return SUCCESS;  
        }else{  
            return ERROR;  
        }  
    }  
}  
