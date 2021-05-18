#include <jni.h>
#include <string>
#include "Includes/obfuscate.h"
#include "Includes/Logger.h"
#include "Includes/Utils.h"

bool featuresEnabled = false;


extern "C" JNIEXPORT jboolean JNICALL
Java_com_RaunakMods_login_Raunak_Check(JNIEnv *env, jclass clazz, jstring user,
                                                  jstring pass) {
    
    const char *passStr = env->GetStringUTFChars(pass, 0);

 
    if (strcmp(passStr, OBFUSCATE("123456")) == 0) {
        featuresEnabled = true;
        return true;
    }
    return false;
}



