#import <Foundation/Foundation.h>

@interface com_diamonddevgroup_comscore_ComScoreNativeImpl : NSObject
{
}

-(void) initComScore : (NSString*) param param1 : (NSString*) param1 param2 : (BOOL) param2 param3 : (int) param3;
-(void) notifyExitForeground;
-(void) notifyEnterForeground;
-(void) notifyUxActive;
-(void) notifyViewEvent : (NSString*) param param1 : (NSString*) param1;
-(void) notifyUxInactive;
-(void) notifyHiddenEvent : (NSString*) param param1 : (NSString*) param1;
-(void) notifyUserInteraction;
-(void) setPersistentLabel : (NSString*) param param1 : (NSString*) param1;
-(BOOL) isSupported;
@end
