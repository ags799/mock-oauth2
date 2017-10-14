(ns ags799.mock-oauth2.integration.ping-test
  (:require [clojure.test :refer :all]))

(defn url [path] (str "localhost:8080/" path))

(deftest ping (is (= (url "ping") "todo")))