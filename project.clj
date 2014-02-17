(defproject cider/cider-nrepl "0.1.0-SNAPSHOT"
  :description "nREPL middleware for CIDER"
  :url "https://github.com/clojure-emacs/cider-nrepl"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [clojure-complete "0.2.3"]
                 [cljs-tooling "0.1.2-SNAPSHOT"]
                 [org.clojure/tools.nrepl "0.2.3"]]

  :profiles {:dev {:repl-options {:nrepl-middleware [cider.nrepl.middleware.doc/wrap-doc
                                                     cider.nrepl.middleware.complete/wrap-complete
                                                     cider.nrepl.middleware.info/wrap-info
                                                     ]}}}

  :plugins [[com.cemerick/austin "0.1.3"]]

  )