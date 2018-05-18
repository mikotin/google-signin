# signin-component

Vaadin 10 Java integration of https://github.com/GoogleWebComponents/google-signin

## Development instructions

Fill your own Google Client Id in MY_GOOGLE_CLIENT_ID in file DemoView



Starting the test/demo server:
```
mvn jetty:run
```

This deploys demo at http://localhost:8080

Demo has different options of login button

## Usage

Simplest scenario would be:

```
GoogleSignin signin = new GoogleSignin(MY_GOOGLE_CLIENT_ID);
signin.addLoginListener(event -> {
    Notification.show("Welcome, " + event.getFirstName());
});
```

But you probably want to do something cooler, like set auto-logout on and change the button size and add wicked dropshadow. And if you gonna go totally wild, maybe do something with the user-data provided.

