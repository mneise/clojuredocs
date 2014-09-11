(ns clojuredocs.config
  (:require [clojuredocs.env :as env]))

(def gh-creds {:client-id (env/str :gh-client-id)
               :client-secret (env/str :gh-client-secret)})

(def base-url (env/str :base-url))

(def staging? (env/bool :staging false))

(def ga-tracking-id (env/str :ga-tracking-id "UA-17348828-3"))

(def cljs-dev? (env/bool :cljs-dev false))

(def allow-robots? (env/bool :allow-robots true))

(defn url [& s] (apply str base-url s))

(def cache-markdown? (env/bool :cache-markdown false))

(def debug-exceptions? (env/bool :debug-exceptions true))

(def log-exceptions? (env/bool :log-exceptions false))
