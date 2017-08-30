#import "com_diamonddevgroup_comscore_ComScoreNativeImpl.h"
#import <ComScore/ComScore.h>

@implementation com_diamonddevgroup_comscore_ComScoreNativeImpl

- (void) initComScore : (NSString*) param param1 : (NSString*) param1 param2 : (BOOL) param2 param3 : (int) param3 {
    dispatch_async(dispatch_get_main_queue(), ^{
        SCORPublisherConfiguration *myPublisherConfig = [SCORPublisherConfiguration publisherConfigurationWithBuilderBlock : ^(SCORPublisherConfigurationBuilder
        * builder)
        {builder.publisherId = param;
            builder.publisherSecret = param1;
            builder.usagePropertiesAutoUpdateMode = param2 ? SCORUsagePropertiesAutoUpdateModeForegroundOnly : SCORUsagePropertiesAutoUpdateModeForegroundOnly;
            builder.usagePropertiesAutoUpdateInterval = param3;}
        ];
        [[SCORAnalytics configuration] addClientWithConfiguration : myPublisherConfig];
        [SCORAnalytics start];
    });
}

-(void) notifyExitForeground {
    dispatch_async(dispatch_get_main_queue(), ^{
        [SCORAnalytics notifyExitForeground];
    });
}

-(void) notifyEnterForeground {
    dispatch_async(dispatch_get_main_queue(), ^{
        [SCORAnalytics notifyEnterForeground];
    });
}

-(void) notifyUxActive {
    dispatch_async(dispatch_get_main_queue(), ^{
        [SCORAnalytics notifyEnterForeground];
    });
}

-(void) notifyViewEvent : (NSString*) param param1 : (NSString*) param1 {
    dispatch_async(dispatch_get_main_queue(), ^{
        [SCORAnalytics notifyViewEventWithLabels : [NSDictionary dictionaryWithObjectsAndKeys : param1, param, nil]];
    });
}

-(void) notifyUxInactive {
    dispatch_async(dispatch_get_main_queue(), ^{
        [SCORAnalytics notifyUxInactive];
    });
}

-(void) notifyHiddenEvent : (NSString*) param param1 : (NSString*) param1 {
    dispatch_async(dispatch_get_main_queue(), ^{
        [SCORAnalytics notifyHiddenEventWithLabels : [NSDictionary dictionaryWithObjectsAndKeys : param1, param, nil]];
    });
}

-(void) notifyUserInteraction {
    dispatch_async(dispatch_get_main_queue(), ^{
        [SCORAnalytics notifyUserInteraction];
    });
}

-(void) setPersistentLabel : (NSString*) param param1 : (NSString*) param1 {
    dispatch_async(dispatch_get_main_queue(), ^{
        [[SCORAnalytics configuration] setPersistentLabels : [NSDictionary dictionaryWithObjectsAndKeys : param1, param, nil]];
    });
}

-(BOOL) isSupported {
    return YES;
}

@end
