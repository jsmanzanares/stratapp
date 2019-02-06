
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import com.kms.katalon.core.testobject.TestObject

import java.lang.String


def static "stratapp.Login.ChooseAccount"(
    	TestObject obj	
     , 	String account	) {
    (new stratapp.Login()).ChooseAccount(
        	obj
         , 	account)
}

def static "stratapp.Login.GetUserName"() {
    (new stratapp.Login()).GetUserName()
}

def static "stratapp.NonInput.SendKeys"(
    	TestObject obj	
     , 	String input	) {
    (new stratapp.NonInput()).SendKeys(
        	obj
         , 	input)
}

def static "stratapp.Members.VerifyMember"(
    	String name	
     , 	String roles	) {
    (new stratapp.Members()).VerifyMember(
        	name
         , 	roles)
}

def static "stratapp.Dropdown.Select"(
    	TestObject obj	
     , 	String sInput	) {
    (new stratapp.Dropdown()).Select(
        	obj
         , 	sInput)
}

def static "stratapp.Dropdown.AddSource"(
    	TestObject obj	
     , 	String sInput	) {
    (new stratapp.Dropdown()).AddSource(
        	obj
         , 	sInput)
}

def static "stratapp.Dropdown.SelectMember"(
    	TestObject obj	
     , 	String name	) {
    (new stratapp.Dropdown()).SelectMember(
        	obj
         , 	name)
}
