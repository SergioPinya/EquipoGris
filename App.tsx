/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 */

import React from 'react';
import {
  ScrollView,
  StatusBar,
  StyleSheet,
  Text,
  View,
} from 'react-native';
import { Button } from 'react-native-paper';

const  App = () => {
  return (
    <View>
      <StatusBar/>
      <Text style={stils.sectionTitle}>Holi </Text>
      <Button icon='camera' >Polsa ací</Button>
    </View>
  );
}

const stils = StyleSheet.create({
  sectionTitle: {
    fontSize: 24,
    fontWeight: '600',
  },

});

export default App;
