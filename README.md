```
clj -m cljs.main -re node
(require 'app.test)
(app.test/run-tests)
(require 'app.test :reload)
(app.test/run-tests)
```
