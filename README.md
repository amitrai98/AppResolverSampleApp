# AppResolverSampleApp
# AppResolver

Introduction :-

AppResolver library is designed for resolving the needs of opening links to there respective application.

Uses :-
This Library can be used for opening different app links and webpages to there respective application.

Current Support :-
This library currently resolves follwing app links,

YOUTUBE,
GPLUS,
FACEBOOK,
TWITTER,
LINKEDIN,
BLOGSPOT,
INSTAGRAM,
PINTEREST

Working on expanding this list further.


Contributers :-
Amit Rai. :- Linkedin (https://in.linkedin.com/in/amit-rai-75730679)
            GitHub(https://github.com/zenix98)
            
            jar could be found from (https://drive.google.com/file/d/0B1Wmo-ef_TnXVHY2Y1FUTVpxNlU/view?usp=sharing)
            
            
USE :-
            Just call the static method of the library and pass the activity context and url that need to be opened it will resolve by itself.
            
            AppResolver.resolve(MainActivity.this, "https://www.youtube.com/user/TEDtalksDirector");
            
            if the application is available it will open the url in the app else it will open up a app selector dialog which willl ask user to select any of the app to open the link in.
